# LabSeq
API Rest implementation of the LabSeq sequence

Notes:

- To start the frontend, open your command line in the repository location, inside frontend and type: ng serve
- To start the backend, you need a spring initializer like https://start.spring.io/ or you can run locally on your pc
- Unfortanely, in the frontend, its impossible to display really big numbers in the display box due to the limitations of String variables and BigInt, so it returns Infinity
- Before you can calculate a really big number, you have to calculate some small ones first so it can store the previous ones in the cache
