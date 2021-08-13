import { Component } from '@angular/core';
import { Router} from '@angular/router';
import { AccountsService} from '../services/accounts/account.service';

@Component({
  selector: 'app-tabdep',
   moduleId: module.id,
  templateUrl: './tabdep.component.html',

 
})

export class TermDepositeSummaryComponent{
	profile = {};
	selectedService: any;
	customerId: any;
	nbraccount: any;
	transactionInfos = {};
	
	
	constructor(private accountsService: AccountsService) {
		this.accountsService.getAccounts().subscribe(data => this.profile = data);
		
	}
	

	getSelectedLoan(loan){
	
	this.accountsService.setSelecetd_Beneficiary(loan);
	  

   
	
	
	}
	
	
}