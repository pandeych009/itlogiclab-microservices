#! /bin/bash -e

path='/Users/cpandey/dev/github/itlogiclab-microservices/itlogiclab-restaurant-parent/deployment/billing-deployment/test/billing_add.json'
printf "\n\n"
echo "ADD RECORD USING URL - HOST BASED ROUTING - http://billing.itlogiclabs-api.com/billing/api/add"

printf "\n\n"
curl -X PUT "http://billing.itlogiclab-api.com/billing/api/add" \
-H "Content-Type: application/json" \
-d @$path

printf "\n\n"
printf "\nADD RECORD USING URL - PATH BASED ROUTING - http://itlogiclabs-api-local.com/billing/api/add"
printf "\n\n"
curl -X PUT "http://itlogiclabs-api-local.com/billing/api/add" \
-H "Content-Type: application/json" \
-d @$path




