import { CustomersListComponent } from './customers/customers-list/customers-list.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: 'technologies', pathMatch: 'full' },
  { path: 'technologies', component: CustomersListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
