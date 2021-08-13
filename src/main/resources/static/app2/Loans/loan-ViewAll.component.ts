import { Component, OnInit } from '@angular/core';
import { AccountsService} from '../services/accounts/account.service';

@Component({

  moduleId: module.id,
  selector: 'app-ViewAll-activity',
  templateUrl: './loan-ViewAll.component.html'
 
})
export class LoanViewAllComponent implements OnInit {


loanDetails = {};

  constructor(private accountsService: AccountsService) { 
  
   this.accountsService.getAllLoanDetails().subscribe(data =>
       
       { 
       
       this.loanDetails = data;

       
       }
       
       );
  
  
  
  }

  ngOnInit() {
  }
  
  
  selectedLoan(loan){
  
  this.accountsService.setSelecetd_Beneficiary(loan);
  

  
  }
  
  
  
  
  

}
