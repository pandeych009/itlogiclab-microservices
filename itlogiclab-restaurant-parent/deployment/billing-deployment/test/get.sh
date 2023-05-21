#! /bin/bash -e
port=$1
echo "GET ALL THE MESSAGE with URL http://localhost:$port/billing/api/get"
curl "http://localhost:$port/billing/api/get" \
-H "Accept: application/json"

echo "**********************************************************************"


echo "GET FIRST THE MESSAGE with URL http://localhost:$port/billing/api/get/13"
curl "http://localhost:$port/billing/api/get/13" \
-H "Accept: application/json"