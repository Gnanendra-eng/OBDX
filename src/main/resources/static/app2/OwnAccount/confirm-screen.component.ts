import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';
import { AccountsService} from '../services/accounts/account.service';

@Component({
  moduleId: module.id,
  templateUrl: './confirm-screen.component.html',

})
export class ConfirmScreenComponent implements OnInit {

  selecetd={};

  constructor(private router: Router, private accountsService: AccountsService ) { }

  ngOnInit() {
  
   this.selecetd=this.accountsService.getSelecetd_Beneficiary();
  }

  getConfirmAlert(){

   
    
       this.router.navigate(['/tabs/OwnAc-Sucess']);
  }
  
  getVerfiScreen(){
   this.router.navigate(['userprofile']);
  }

}
