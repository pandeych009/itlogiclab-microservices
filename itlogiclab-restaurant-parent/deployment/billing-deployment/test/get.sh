#! /bin/bash -e
port=$1
echo "GET ALL THE MESSAGE with URL http://billing.itlogiclab-api.com/billing/api/get"
#curl "http://localhost:$port/billing/api/get" \
curl "http://billing.itlogiclab-api.com/billing/api/get" \
-H "Accept: application/json"

echo "**********************************************************************"


echo "GET FIRST THE MESSAGE with URL http://localhost:$port/billing/api/get"
curl "http://localhost:$port/billing/api/get" \
-H "Accept: application/json"