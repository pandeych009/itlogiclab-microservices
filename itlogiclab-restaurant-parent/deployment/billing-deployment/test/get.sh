#! /bin/bash -e
port=$1

echo "**********************************************************************"

echo "GET FIRST THE MESSAGE WITH URL http://localhost:$port/billing/api/get"
curl "http://localhost:$port/billing/api/get" \
-H "Accept: application/json"