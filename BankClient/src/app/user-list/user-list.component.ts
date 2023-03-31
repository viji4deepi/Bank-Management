import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user-service.service'; 

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: User[] = [];

  constructor( private route: ActivatedRoute, 
    private router: Router, 
      private userService: UserService) {
        this.users = [];
  
  }

  ngOnInit() {
    this.userService.findAll().subscribe((data) => {
      this.users = data;
    });
  }
}
