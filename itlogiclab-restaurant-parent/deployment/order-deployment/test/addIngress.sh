#! /bin/bash -e

path='/Users/cpandey/dev/github/itlogiclab-microservices/itlogiclab-restaurant-parent/deployment/order-deployment/test/order_add.json'
printf "\n\n"
echo "ADD RECORD USING URL - HOST BASED ROUTING - http://order.itlogiclabs-api.com/order/api/add"
printf "\n\n"

curl -X PUT "http://order.itlogiclab-api.com/order/api/add" \
-H "Content-Type: application/json" \
-d @$path


printf "\n\n"
printf "\nADD RECORD USING URL - PATH BASED ROUTING - http://itlogiclabs-api-local.com/order/api/add"
printf "\n\n"

curl -X PUT "http://localhost:$port/order/api/add" \
-H "Content-Type: application/json" \
-d @$path





