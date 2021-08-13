import { Component, OnInit } from '@angular/core';
import { AccountsService} from '../services/accounts/account.service';

@Component({


  moduleId: module.id,
  selector: 'loan-details.component',
  templateUrl: './loan-details.component.html'
  
})
export class LoanDetailsComponent implements OnInit {
  
  
  selecetd ={};
  constructor(private accountsService: AccountsService) {
  
  this.selecetd=this.accountsService.getSelecetd_Beneficiary();
  
  

  console.log(this.selecetd);
  
  
   }

  ngOnInit() {
  
  
  
  }

}
