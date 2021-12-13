export interface ITask {
    taskid:number;
    
    ownerid:number;
    creatorid:number;
    name:string;
    dscrptn:string;
    status:string;
    priority:string;
    notes:string;
    isbookmarked:Boolean;
    created_on:Date;
    status_created_on:Date;
}