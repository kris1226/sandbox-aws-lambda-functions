#!/bin/bash

aws lambda update-function-code \
  --function-name sandbox-helloclj-hi \
  --zip-file fileb://./target/sandbox-helloclj-hi-0.1.0-SNAPSHOT-standalone.jar
  