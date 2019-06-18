if curl -s --head  --request GET http://a9fc84018913511e990920682ffff8bc-2121391132.us-east-2.elb.amazonaws.com:8080 | grep "200 OK" > /dev/null; then 
   echo "Spring Boot App is UP"
else
   echo "Spring Boot App  is DOWN"
fi
