import { Router} from '@angular/router';
import { Component, OnInit, Input } from '@angular/core';
import { AccountsService} from '../services/accounts/account.service';
import { DatePipe } from '@angular/common';



@Component({

    moduleId: module.id,
    selector: 'app-intilize-screen',
    templateUrl: 'intilize-screen.component.html',
    providers: [DatePipe]
})

export class IntilizeScreenComponent implements OnInit {


	 
	Destination = [];
	profile: any = [];
	des_enable=true;
	initi_button=true;
	isPayLater=true;
	
	
	
	code={};
	mode={};
	
	

    currentDate;
	
	hide=false;

	src=[];
	
inti_details={

         sele_src_account:'',

         sele_des_account:'',

         selected_date:'',

         avl_balance: ''

};

    constructor(private router: Router , private accountsService: AccountsService,private datePipe: DatePipe
 ) { 

    
    
    }

  ngOnInit() {
  
  this.accountsService.getAllRecords().subscribe(data => 

      {
         this.profile = data;
         
         this.src=this.profile[0];

      }
  );
  
  
   this.accountsService.getclearingcodes().subscribe(data => 

      {
         this.code = data;
         console.log(this.code);
  

      }
  );
  
  
  
  this.accountsService.getFetechMode(this.val).subscribe(data => 

      {
         this.mode = data;
         console.log(this.mode);
         
  

      }
  );
  
  
  
             }


getSeleSrcAccount(id){

this.Destination = this.profile.filter(value => value.id !== parseInt(id));
this.src = this.profile.filter(value => value.id == parseInt(id));
this.inti_details.avl_balance = this.src[0].avail_balance;
this.inti_details.sele_src_account=this.src[0].account_number;

this.des_enable=false;


}



onChange(event){

	this.des_enable=false;
	
	this.initi_button=false;

	
	this.inti_details.sele_des_account=event;	

}

isPayNow(){
this.isPayLater=true;
this.inti_details.selected_date=this.datePipe.transform(new Date(),'dd-MM-yy');


}


getPayDate(){

this.isPayLater=false;

}




goToVeryScreen() {


  this.accountsService.setSelecetd_Beneficiary(this.inti_details);


 this.router.navigate(['/tabs/OwnAc-verification']);
 console.log(this.current_date);

}





}