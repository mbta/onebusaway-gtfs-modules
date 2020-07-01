#!/bin/bash
set -e
mvn clean install -Dmaven.test.skip=true -Dgpg.skip -Dmaven.javadoc.skip=true -Dlicense.skip -Dmaven.repo.local="${SEMAPHORE_CACHE_DIR:-$HOME}/.m2/"
