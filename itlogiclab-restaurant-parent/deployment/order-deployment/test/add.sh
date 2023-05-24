#! /bin/bash -e
port=$1

echo "test ingress"
sleep 2
curl -X PUT "http://order.itlogiclab-api.com/order/api/add" \
-H "Content-Type: application/json" \
-d @./order-deployment/test/order_add.json


echo "test local"
curl -X PUT "http://localhost:$port/order/api/add" \
-H "Content-Type: application/json" \
-d @./order-deployment/test/order_add.json




