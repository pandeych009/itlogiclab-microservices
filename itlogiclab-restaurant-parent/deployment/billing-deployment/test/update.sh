#! /bin/bash -e
port=$1

curl -X PUT "http://localhost:$port/billing/api/add" \
-H "Content-Type: application/json" \
-d @./billing-deployment/test/billing_update.json