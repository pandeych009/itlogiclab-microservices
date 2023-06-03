#! /bin/bash -e

idToGetRecord=$1

if [ $idToGetRecord -gt "0" ]
then

printf "\n\nGET RECORDS USING URL - PATH BASED ROUTING - http://itlogiclabs-api-local.com/order/api/get/$idToGetRecord\n\n"
#curl "http://localhost:$port/order/api/get" \
curl "http://itlogiclabs-api-local.com/order/api/get/$idToGetRecord" \
-H "Accept: application/json"


printf "\n\nGET RECORDS USING URL - HOST BASED ROUTING - http://order.itlogiclab-api.com/order/api/get/$idToGetRecord\n\n"
curl "http://order.itlogiclab-api.com/order/api/get/$idToGetRecord" \
-H "Accept: application/json"
else

printf "\n\nGET ALL THE RECORDS USING URL - PATH BASED ROUTING - http://itlogiclabs-api-local.com/order/api/get\n\n"
#curl "http://localhost:$port/order/api/get" \
curl "http://itlogiclabs-api-local.com/order/api/get" \
-H "Accept: application/json"


printf "\n\nGET ALL THE RECORDS USING URL - HOST BASED ROUTING - http://order.itlogiclab-api.com/order/api/get\n\n"
curl "http://order.itlogiclab-api.com/order/api/get" \
-H "Accept: application/json"
fi