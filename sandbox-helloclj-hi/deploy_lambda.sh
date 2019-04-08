#!/bin/bash

aws lambda create-function \
  --function-name sandbox-helloclj-hi \
  --handler MyLambdaFn \
  --runtime java8 \
  --memory 512 \
  --timeout 10 \
  --role arn:aws:iam::718222947470:role/Lambda-read-S3 \
  --zip-file fileb://./target/sandbox-helloclj-hi-0.1.0-SNAPSHOT-standalone.jar
  