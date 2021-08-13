import { Component, OnInit, Input } from '@angular/core';

import {FormGroup } from '@angular/forms';
import { Router} from '@angular/router';

import { FormBuilder,Validators } from '@angular/forms';
import { AccountsService} from '../services/accounts/account.service';
import { Benefeciary } from '../Domestic/benefeciary';


@Component({
  moduleId: module.id,
  templateUrl: './add-payee-form.component.html',
})
export class AddPayeeFormComponent implements OnInit {

  ele=false;
  isSwift=true;
  isNcc=true;
  
  sele_SwiftCode='';
  
  profileForm;

  benefeciary : Benefeciary = new Benefeciary();
  
  
  bank_details={
             
             swift_Code:'',
             bank_name:'',      
             bank_street:'',
             bank_location:''
  }
  
  
  inti_details:[]=[
  
            {

             id:1,
             swift_Code:'axis123',
             bank_name:'AXIS BANK',      
             bank_street:'WHITE FIELD',
             bank_location:'BANGLORE'

            },
            
            {

              id:2,
              swift_Code:'sbi123',
              bank_name:'STATE BANK',      
              bank_street:'MARTHAHALLI',
              bank_location:'BANGLORE'

            },
            
            
            {

              id:3,
              swift_Code:'abn123',
              bank_name:'ANDHRA BANK',      
              bank_street:'GANDHI ROAD',
              bank_location:'TIRUPATHI'

            },

];
  
  
  
  
   


  constructor( private router: Router, private fb: FormBuilder) {
  }

  ngOnInit() {
  
	  this.formgroup();
  
  }
  
  formgroup(){
  
  
       this.profileForm = this.fb.group({
     
             account_number: ['',
             
             Validators.compose([
             Validators.required,
            ]) 
             ],
             branch_code: ['',
             
             Validators.compose([Validators.required,Validators.pattern( '^[a-zA-Z0-9 \-\']+'  )  ])
             
             
             ],
             
             payye_name: ['',  
             
             Validators.compose([
             Validators.required,
             Validators.minLength(5),
             Validators.pattern('^[a-zA-Z \-\']+')])
             ],
             
             nick_name: ['' , [Validators.required]], 
             
             phone_numbr: ['',
             
             Validators.compose([
             Validators.required,
             Validators.minLength(10),
             Validators.maxLength(10)
           
                ])
            
            ],
            email: ['',
   
             Validators.compose([
             Validators.required,
             Validators.email,
             
                              ]) 
            
                   ]

      });
  
}


  createUser(): void {
  
 
  
     this.benefeciary=this.profileForm.value;
   
     this.ele=true;
   
}



getBankAddress(){


for(let i=0;i<this.inti_details.length;i++){



if(this.sele_SwiftCode === this.inti_details[i].swift_Code ){

this.bank_details.swift_Code =this.sele_SwiftCode;
this.bank_details.bank_name =this.inti_details[i].bank_name;

this.bank_details.bank_street =this.inti_details[i].bank_street;

this.bank_details.bank_location =this.inti_details[i].bank_location;



}



}




}
  
 getNccCode(){

this.isNcc=false;
this.isSwift=true;

}


getSwiftCode(){

this.isSwift=false;
this.isNcc=true;



} 



goToInitScreen(){

this.router.navigate(['/tabs/Domestic-Initialize']);

}





}
