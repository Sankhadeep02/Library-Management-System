import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { AuthorComponent } from './author/author.component';
import { BookComponent } from './book/book.component';
import { LoanComponent } from './loan/loan.component';
import { PublisherComponent } from './publisher/publisher.component';
import { StudentComponent } from './student/student.component';

const routes: Routes = [
  {
    path: 'books',
    component: BookComponent,
  },

  {
    path: 'author',
    component: AuthorComponent,
  },

  {
    path: 'publisher',
    component: PublisherComponent,
  },

  {
    path: 'student',
    component: StudentComponent,
  },

  {
    path: 'loan',
    component: LoanComponent,
  },

  {
    path: 'admin',
    component: AdminComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
