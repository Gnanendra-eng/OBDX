import { Component } from '@angular/core';
import { Router} from '@angular/router';
import { AccountsService} from '../services/accounts/account.service';

@Component({

    moduleId: module.id,
    selector: 'account-summary',
    templateUrl: 'account-summary.html'
})

export class AccountSummary {
	profile = {};
	selectedService: any;
	customerId: any;
	nbraccount: any;
	transactionInfos = {};
	
	
	constructor(private accountsService: AccountsService) {
		this.accountsService.getAccounts().subscribe(data => this.profile = data);
		
	}
	

	onChange(newValue) {  
		this.customerId = this.profile.customerId;
		this.nbraccount = newValue;
		this.accountsService.getTransactionActivity(this.customerId, this.nbraccount).subscribe(data => this.transactionInfos = data);
	}
	
	
}