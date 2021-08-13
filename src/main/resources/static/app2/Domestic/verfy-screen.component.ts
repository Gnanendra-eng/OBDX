import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';
import { AccountsService} from '../services/accounts/account.service';
import { DomesticVerification } from '../Domestic/benefeciary';
import { IntiScreenComponent } from './Domestic/inti-screen.component';
import { DatePipe } from '@angular/common';

@Component({

   moduleId: module.id,
   selector: 'app-verify-screen',
  templateUrl: './verfy-screen.component.html',
  providers: [DatePipe]
})
export class VerfyScreenComponent implements OnInit {
    
	 profile = [];
	 credit = {};
	 selecetd:any ={};
	 
	 Domestic ={};
	 amount:any;
	 isFormHide =false;
	
	
	 avil_bal='';
	 avl_bal_disable=true;
	 creditAccount={};

	
	 isPayLater=true;
	 
	 date =true;
	 
	 selected_debit_Account:any = this.profile[0];
	 
	 
     domesticVerification: DomesticVerification = new DomesticVerification();
  

  constructor(private router: Router, private accountsService: AccountsService,private datePipe: DatePipe  ) 
  
  {
  

    
 
   }

  ngOnInit() {
  
    this.accountsService.getAllRecords().subscribe(data => this.profile = data);
    
    this.selecetd=this.accountsService.getSelecetd_Beneficiary();

    this.domesticVerification.destination_acc = this.selecetd[0].account_number;
    
    this.domesticVerification.payee_name = this.selecetd[0].payye_name;
    
    this.domesticVerification.txn_purpose = this.selecetd[0].bank_name;
    
    this.domesticVerification.branch_code = this.selecetd[0].branch_code;
    
  

  
  
  
  }


getDebitAccount(Debitaccount_id){


this.selected_debit_Account = this.profile.filter(value => value.id === parseInt(Debitaccount_id));

this.domesticVerification.source_acc =this.selected_debit_Account[0].account_number;

this.avil_bal = this.selected_debit_Account[0].avail_balance;

this.accountsService.setSelecetd_Beneficiary(this.avil_bal);

this.domesticVerification.source_acc_bal = this.avil_bal;



}


getPaymentMode(newValue){

this.domesticVerification.maker_id = newValue;


}



goToInitScreen(){


this.router.navigate(['/tabs/Domestic-Initialize']);

}

isPayNow(){
this.isPayLater=true;

this.domesticVerification.txn_date=this.datePipe.transform(new Date());

}

  save() {
  
    console.log(this.domesticVerification);
  }



goToConfirmScreen(){


this.accountsService.getDomesticTransferConfirm().subscribe(data => this.Domestic = data);



     this.accountsService.setSelecetd_Beneficiary(this.domesticVerification);
  	 this.isFormHide =true;
  
   this.router.navigate(['/tabs/Doemstic-Confirm']);
}


getPayDate(){

this.isPayLater=false;

}



}
