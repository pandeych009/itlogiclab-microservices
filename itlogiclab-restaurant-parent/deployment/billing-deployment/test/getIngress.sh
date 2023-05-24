#! /bin/bash -e

printf "\n\nGET ALL THE RECORDS USING URL - PATH BASED ROUTING - http://itlogiclabs-api-local.com/billing/api/get\n\n"
#curl "http://localhost:$port/billing/api/get" \
curl "http://itlogiclabs-api-local.com/billing/api/get" \
-H "Accept: application/json"


printf "\n\nGET ALL THE RECORDS USING URL - HOST BASED ROUTING - http://billing.itlogiclab-api.com/billing/api/get\n\n"
curl "http://billing.itlogiclab-api.com/billing/api/get" \
-H "Accept: application/json"
