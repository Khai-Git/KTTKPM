const express = require('express')
const data = require('./store')
const AWS = require('aws-sdk');
const multer = require('multer')
const app = express()
const port = 3000
 
app.use(express.json({extended: false}));
app.use(express.static('./views'))
app.set('view engine', 'ejs');
app.set('views', './views');

// app.get('/', (req, res) => {
//   return res.render('index',{data: data});
// })

AWS.config.update({
  region: process.env.REGION,
  accessKeyId: process.env.ACCESS_KEY_ID,
  secretAccessKey: process.env.SECRET_ACCESS_KEY
});

const docClientDynamoDB = new AWS.DynamoDB.DocumentClient();

app.get('/', (req, res) => {
  return res.render('index');
})

app.post('/', upload.fields([]) ,(req,res)=>{
 data.push(req.body);
 return res.redirect('/');
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})

// config aws dynamodb 
constAWS = require('aws-sdk');
const config = new AWS.Config({
  accessKeyId: 'AKIAVBTGHWSE5KHN2AI7',
  secretAccessKey: 'y41ehhmSnwOFECbwzFcI2CirBANrU24indWF5RQh',
  region: 'us-west-2',
})

AWS.config = config;

const docClient = new AWS.DynamoDB.DocumentClient();

const tableName = 'SanPham';

const multer = require('multer');
const upload = multer();

app.get('/',(req,res) => {
  const params = {
    TableName: tableName,
  }

  docClient.scan(params, (err,data) => {
    if (err) {
      res.send('Inernal Sever Error');
    } else {
      return res.render('index', {sanPhams: data.Items})
    }
  });

app.post('/', upload.fields([]), (req,res) => {
  const { ma_sp, ten_sp, so_luong } = req.body;
  const params = {
    TableName: tableName,
    Item: {
      "ma_sp": ma_sp,
      "ten_sp": ten_sp,
      "so_luong": so_luong
    }
  }

  docClient.put(params,(err,data) => {
    if(err){
      return res.send('Internal Server Error');
    } else {
      return res.redirect("/");
    }
  })
})

app.post('/delete', upload.fields([]), (req,res) => {
  const listItems = Object.keys(req.body);

  if(listItems === 0) {
    return res.redirect("/");
  }

  function onDeleteItme(index){
    const params = {
      TableName: tableName,
      Key: {
        "ma_sp": listItems[index]
      }
    }

    docClient.delete(params, (err,data) => {
      if(err) {
        return res.send('Internal Server Error');
      } else {
        if(index > 0) {
          onDeleteItme(index - 1);
        } else {
          return res.redirect("/");
        }
      }
    })
  }
})

onDeleteItme(listItems.length - 1);
});