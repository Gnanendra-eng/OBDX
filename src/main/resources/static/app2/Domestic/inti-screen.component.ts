import { Component, OnInit,Input } from '@angular/core';
import { Router} from '@angular/router';
import { AccountsService} from '../services/accounts/account.service';

@Component({

  moduleId: module.id,
  selector: 'app-inti-screen',
  templateUrl: './inti-screen.component.html'
  
})
export class IntiScreenComponent implements OnInit {


	profile = {};
	records: any = [];
	
	selected_ben={};
	
	ben = {};
	
	proceed=false;
	nan;
	
	selecetd_id;
	date=new Date();
	
		
	obj = {
	
	
	
	requestUrl: 'DOMESTIC_REQC',
	ref_transfer_purpose_id: 1,
	ref_currency_id: '21',
	ref_biller_id: '141',
	ref_beneficiary_id: '161',
	ref_account_type_id: '2',
	customer_id:'00000144',
	to_account_number: '504008141509',
	from_account_number: '0101030000005', 
	to_branch_code: '007',
	from_branch_code: '010',
	amount: '1000',
	transfer_date: '2019-01-04',
	note: 'note',
	reference_id:'1509198218523',
	transferType: 'DOM'
	
	}
	
	 
	 
selected_Account:any = this.records[0];


constructor(private router: Router  , private accountsService: AccountsService ) { 



}




  ngOnInit() {
  
  this.accountsService.getAllRecords().subscribe(data => 

      {
         this.ben = data;

       
      }
  );
  
   this.accountsService.getDomesticBeneficiaryDetails().subscribe(data => 

      {
         this.records = data;
         console.log(this.ben);

       
      }
  );
  
 
 
 }


  goToVeryScreen() {
  
  
  
    this.accountsService.getSelecetdBen().subscribe(data => 

      {
         this.selected_ben = data;
        

       
      }
  );
  
  
  
  
  this.router.navigate(['/tabs/Domestic-verification']);



  }


  goToAddScreen() {
    this.router.navigate(['/tabs/Domestic-AddPayee']);
  }
  
  
  onChange(id:any){
  
      
        this.selecetd_id=id;
        this.selected_Account = this.records.filter(value => value.id === parseInt(id));

   
       this.accountsService.setSelecetd_Beneficiary(this.selected_Account);
  
       
        this.accountsService.validate(this.obj).subscribe(data => 

      {
        this.nan=data;
     
          console.log(this.nan);

       
      }
  );
     
     this.proceed=false;
      	 	 	 	 	 
 	 
  
  }


}
