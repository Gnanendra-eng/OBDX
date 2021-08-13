import { IntilizeScreenComponent } from './OwnAccount/intilize-screen.component';
import { Component, OnInit, Input } from '@angular/core';
import { Router} from '@angular/router';
import { ConfirmScreenComponent } from './OwnAccount/confirm-screen.component';
import { AccountsService} from '../services/accounts/account.service';
import { IntilizeScreenComponent } from './OwnAccount/intilize-screen.component';
import { FormBuilder,Validators,AbstractControl,REACTIVE_FORM_DIRECTIVES } from '@angular/forms';
import { Router} from '@angular/router';
import { ageRangeValidator,amtvalidator } from '../OwnAccount/myvalidator';



@Component({
  moduleId: module.id,
   selector: 'app-ownAccountVerify-screen',
    directives: [REACTIVE_FORM_DIRECTIVES],
  
  templateUrl: './verification-screen.component.html'

})
export class VerificationScreenComponent  implements OnInit {


initi_details={};

  constructor(private router: Router , private accountsService: AccountsService, private fb: FormBuilder) {
  }

  ngOnInit() {
  
           this.initi_details=this.accountsService.getSelecetd_Beneficiary();
         
            
             this.formGroup();
   

  }
  
  
  
  
    

  
  formGroup(){
     this.profileForm = this.fb.group({
     
             source_account: [this.initi_details.sele_src_account],
             destination_account: [this.initi_details.sele_des_account],
             
             txn_date: [this.initi_details.selected_date],  
      
             avl_bal: [this.initi_details.avl_balance], 
             
             amount: ['',Validators.compose([ageRangeValidator(this.initi_details.avl_balance),Validators.pattern('^[0-9]+$')])
             ],    
           
             note: ['']
              

      });
      }
  

  goToIntilizeScreen() {
    this.router.navigate(['/tabs/OwnAc-Initialize']);
  }
  
  goToConfirmScreen(){
  
   this.accountsService.setSelecetd_Beneficiary(this.profileForm.value);
   console.log(this.profileForm.value);
  
   this.router.navigate(['/tabs/OwnAc-Confirmation']);
   
  
  
  }
  
  

}
