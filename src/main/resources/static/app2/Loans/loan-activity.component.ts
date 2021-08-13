import { Component, OnInit } from '@angular/core';

import { FormBuilder,Validators } from '@angular/forms';
import {FormGroup } from '@angular/forms';

@Component({

  moduleId: module.id,
  selector: 'app-loan-activity',
  templateUrl: './loan-activity.component.html'
 
})
export class LoanActivityComponent implements OnInit {

profileForm;
hide=true;

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
  
    this.formgroup();
  }
  
  formgroup(){
  
  
       this.profileForm = this.fb.group({
     
             selectedAccount: [''],
             transactionType: [''],
             searchBy: [''],  
             fromDate: [''], 
             toDate: [''],
     
            sortBy: [''],
             sortOrder: ['']
      });
  
}

  createUser(): void {
  
    console.log(this.profileForm.value);
      this.hide=false;
   

   
}
  
  
 

}
