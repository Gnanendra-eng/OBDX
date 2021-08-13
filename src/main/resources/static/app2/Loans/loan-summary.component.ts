import { Component, OnInit } from '@angular/core';
import { AccountsService} from '../services/accounts/account.service';

@Component({

  moduleId: module.id,
  selector: 'app-loan-summary',
  templateUrl: './loan-summary.component.html'

})
export class LoanSummaryComponent implements OnInit {



loanDetails = {};

newLoan ={};

account_details={};
acc_number={"accNo":"0101030000005"};


  constructor(private accountsService: AccountsService) {

      
       this.accountsService.getAllLoanDetails().subscribe(data =>
       
       { 
       
       this.loanDetails = data;
       
       console.log(this.loanDetails);
        
       console.log(this.loanDetails.closedBasicLoanDetails[0].userReferenceNo);
       
       
       
       }
       
       );
        
       
  
   }

  ngOnInit() {
     
       
        

  }
  
 getSelectedLoan(loan){
 
 this.accountsService.setSelecetd_Beneficiary(loan);
 
 }

}
