import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user-service.service';
// import { UserService } from '../service/user.service';
// import { User } from '../model/user';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {

  user: User;

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private userService: UserService) {
  
  }

  onSubmit() {
    this.userService.save(this.user).subscribe((result: any) => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/users']);
  }
}