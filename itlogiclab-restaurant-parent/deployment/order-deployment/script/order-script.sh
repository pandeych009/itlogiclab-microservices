#! /bin/bash -e

mvn clean install -DskipTests=true

version=$1
echo 'Image will be create with version '$version

cd /Users/cpandey/dev/github/itlogiclab-microservices/itlogiclab-restaurant-parent/service/itlogiclab-restaurant-order
docker build -f web-Dockerfile -t pandeych009/itlogiclab-restaurant-order:$version .
docker push pandeych009/itlogiclab-restaurant-order:${version}
echo "Docker build completed for itlogiclab-restaurant-order project: build Image: itlogiclab-restaurant-order:"$version