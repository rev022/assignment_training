import { Component,OnInit } from "@angular/core"; 
import { FormGroup,FormControl,Validators } from "@angular/forms"; 

@Component({
    selector:"case",
    templateUrl:"./CaseForm.html"
})
export class CaseForm implements OnInit{
    form:any;
    tid!:number;
    oid!:number;
    cid!:number;
    tname!:string;
    des!:string;
    stat!:string;
    pri!:string;
    not!:string;
    isbok!:Boolean;
    crea!:Date;
    stacrea!:Date;

    ngOnInit() {
        this.form=new FormGroup({
            taskid:new FormControl(
                "",
                Validators.compose([Validators.required,Validators.minLength(3)])
            ),
            ownerid:new FormControl("",Validators.compose([Validators.required])),
            creatorid:new FormControl("",Validators.compose([Validators.required])),
            taskname:new FormControl("",Validators.compose([Validators.required,Validators.minLength(5)])),
            description:new FormControl("",Validators.compose([Validators.required,,Validators.minLength(5)])),
            status:new FormControl("",Validators.compose([Validators.required])),
            priority:new FormControl("",Validators.compose([Validators.required])),
            notes:new FormControl("",Validators.compose([Validators.required])),
            isBookmarked:new FormControl("",Validators.compose([Validators.required])),
            created_on:new FormControl("",Validators.compose([Validators.required])),
            status_changed_on:new FormControl("",Validators.compose([Validators.required]))

        });
    }
    onSubmit(user:any){
        console.log(user);
        this.tid=user.taskid;
        this.oid=user.ownerid;
        this.cid=user.creatorid;
        this.tname=user.taskname;
        this.des=user.description;
        this.stat=user.status;
        this.pri=user.priority;
        this.not=user.notes;
        this.isbok=user.isBookmarked;
        this.crea=user.created_on;
        this.stacrea=user.status_changed_on;

    }
}