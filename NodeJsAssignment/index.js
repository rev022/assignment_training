//console.log("My node eg");
//const Person = require("./Person");
//const PD = require('./PersonDetails');
/*const Logger = require('./logger_demo');

const logger = new Logger();
logger.on('message',(data)=>console.log('called listener',data));
logger.log('hello world')*/

//console.log(Person.age);
//console.log(PD.name);






/*const http = require('http');
const path = require('path');
const fs = require('fs');

const server = http.createServer((req,res)=>{
let filePath = path.join(__dirname,"public",req.url ==='/' ?"index.html": req.url);
let extname = path.extname(filePath);

let contentType = "text/html";
switch(extname){
    case ".js":
        contentType="text/javascript";
        break;
    case ".css":
        contentType="text/css";
        break;
    case ".json":
        contentType="application/json";
        break;
    case ".png":
            contentType="image/png";
            break;
}
fs.readFile(filePath, (err, content)=>{
    if(err) {
        if(err,code =="ENOENT") {
            fs.readFile(
                path.join(__dirname,"public", "404.html"),
                (err, content)=>{
                    res.writeHead(400,{'Content-Type':'text/html'});
                    res.end(content, "utf8");

                }
            );
        } else {
            res.writeHead(500);
            res.end('Server Error: ${err.code}');
        }
    } else {
        res.writeHead(200,{'Content-Type':contentType});
        res.end(content, "utf8");

    }
});

})
const PORT= process.env.PORT || 5000;
server.listen(PORT,()=>console.log(`Server running on port ${PORT}`));*/

const Logger = require('./loggerAssignment');

const logger = new Logger();
logger.on('message',(data)=>console.log('called listener',data));
logger.log('Welcome  to NodeJS')