import http from "http";

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader("Content-Type", "text/plain");
  res.end("Hello World, from Node Js");
});

server.listen(3000, () => {
  console.log("Server running on port 3000");
});
