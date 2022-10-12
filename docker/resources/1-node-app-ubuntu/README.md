    1  apt-get update
    2  apt-get install curl -y
    4  curl -sL https://deb.nodesource.com/setup_14.x | bash
    5  apt-get install nodejs -y
    6  node
    8  cd opt/
   10  mkdir node-app
   11  cd node-app
   13  echo 'console.log("nodejsapp from ubuntu...");' > index.js
   16  node index.js
   17  history