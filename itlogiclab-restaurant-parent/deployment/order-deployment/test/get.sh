#! /bin/bash -e
port=$1
sleep 1
echo "GET ALL THE MESSAGE with URL http://localhost:$port/order/api/get"
curl --tlsv1.2  "http://localhost:$port/order/api/get" \
-H "Accept: application/json"

echo "**********************************************************************"
sleep 5

echo "GET FIRST THE MESSAGE with URL http://localhost:$port/order/api/get/13"
curl --tlsv1.2 "http://localhost:$port/order/api/get/13" \
-H "Accept: application/json"