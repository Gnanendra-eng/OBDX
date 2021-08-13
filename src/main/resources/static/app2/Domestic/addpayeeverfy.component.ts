import { AddPayeeFormComponent } from './../add-payee-form/add-payee-form.component';
import { Component, OnInit, Input  } from '@angular/core';
import { AccountsService} from '../services/accounts/account.service';
import { Benefeciary } from '../Domestic/benefeciary';

import { Router} from '@angular/router';

@Component({
   moduleId: module.id, 
    selector: 'app-addpayee-confirm',
  templateUrl: './addpayeeverfy.component.html',

})
export class AddpayeeverfyComponent implements OnInit {


 @Input() ben_details;
 @Input() sele_bank_details;
 

 
  constructor(private router: Router,private accountsService: AccountsService) {


  }

  ngOnInit() {
  }


 getConfirmAlert(){
 this.accountsService.createBenefeciary(this.ben_details).subscribe( data => {
          this.router.navigate(['/tabs/Domestic-AddPayeeSuccess']);
        });



}






goToAddScreen(){

this.router.navigate(['/tabs/Domestic-Initialize']);

}

}
