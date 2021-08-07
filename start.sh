#!/usr/bin/env bash

mvn clean package
docker-compose up --build
