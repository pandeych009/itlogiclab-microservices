#! /bin/bash -e
port=$1

curl -X PUT "http://billing.itlogiclab-api.com/billing/api/add" \
-H "Content-Type: application/json" \
-d @./billing-deployment/test/billing_add.json




