import { Component, OnInit } from '@angular/core';
import { ITask } from './task';
import { taskservice } from './taskservice';

@Component({
  selector: 'app-task-case',
  templateUrl: './task-case.component.html',
  //styleUrls: ['./task-case.component.css']
})
export class TaskCaseComponent implements OnInit {
  public Tasks!: ITask[];

  constructor(private taskobj: taskservice) {}

  ngOnInit(): void {
    this.taskobj.getTask()
        .subscribe(data=> this.Tasks =data)
  }

}
