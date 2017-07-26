import {Component} from 'angular2/core'
import {RouteConfig, Router, Route,  ROUTER_DIRECTIVES} from 'angular2/router';

@Component({
  selector: 'dashboard',
	template: `
	  <div style="color:red">dashboard!!!:</div>	`
})

export class Dashboard {
  constructor(public router: Router) {
 
  }
}