import { Directive , forwardRef, Attribute} from '@angular/core';
import {Validator, AbstractControl, NG_VALIDATORS} from '@angular/forms';
import { AccountsService} from '../services/accounts/account.service';

@Directive({
  selector: '[appMyDirective][formControlName],[appMyDirective][formControl],[appMyDirective][ngModel]',
  providers: [{
    provide: NG_VALIDATORS,
    useExisting:forwardRef(() => MyDirectiveDirective),
    multi: true
      }]
})
export class MyDirectiveDirective implements Validator {

 constructor(@Attribute('appMyDirective') public appMyDirective: any,private accountsService: AccountsService)
 {
 }


  validate(control: AbstractControl): {[key: string]: any}|  null {
  
  const  avl = control.root.get(this.appMyDirective); 
  let txn_amt =control.value;
  
  const  avl_balance =this.accountsService.getSelecetd_Beneficiary();
  
  if ( txn_amt === 0) {
  return  {'appMyDirective': true} ;
  }
  
  
 if ( txn_amt > avl_balance ) {
       return { 'amtRange': true };
     }
  
  return null;

  }

  constructor() { }

}

