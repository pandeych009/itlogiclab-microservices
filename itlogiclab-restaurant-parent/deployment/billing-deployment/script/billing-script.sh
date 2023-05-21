#! /bin/bash -e

mvn clean install -DskipTests=true

version=$1
echo 'Image will be create with version '$version

cd /Users/cpandey/dev/projects/Docker-Kube-Projects/itlogiclab-restaurant-parent/service/itlogiclab-restaurant-billing
docker build -f web-Dockerfile -t pandeych009/itlogiclab-restaurant-billing:$version .
docker push pandeych009/itlogiclab-restaurant-billing:${version}
echo "Docker build completed for itlogiclab-restaurant-order project: build Image: itlogiclab-restaurant-order:"$version