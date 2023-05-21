#! /bin/bash -e
port=$1

curl -X PUT "http://localhost:$port/order/api/add" \
-H "Content-Type: application/json" \
-d @./order-deployment/test/order_update.json