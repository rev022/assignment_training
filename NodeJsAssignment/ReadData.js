const fs = require('fs');

const path = require('path');

/*fs.mkdir(path.join(__dirname,'/TrainingDetails'),{},

function(err){

    if(err) throw err;

    console.log('');

}

)*/



fs.writeFile(path.join(__dirname,'/rainingDetails','Stud.txt'),'student name is Revathi Ramesh',

(err) => {

    if(err) throw err;

    console.log('File Written...')

} );