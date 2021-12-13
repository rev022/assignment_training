const fs = require('fs');
const path = require('path');

fs.readFile(path.join(__dirname,'public','hello.java'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});



/*fs.writeFile(path.join(__dirname,'/test','/hello.txt')
   ,'My text file contains'
   ,(err)=>{
    if(err) throw err;
    console.log('File written to...');
});*/

/*fs.appendFile( path.join(__dirname,'/test','/hello.txt'),
    'I love nodeJS',
    err=>{
        if(err) throw err;
        console.log('File appended to...')
    }
)*/



