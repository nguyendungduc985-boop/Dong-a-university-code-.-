"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const http = require("http");
const fs = require("fs");
const path = require("path");
const PORT = 3000;
const UI_DIR = path.join(process.cwd(), "dist");
const server = http.createServer((req, res) => {
    const safeUrl = req.url === "/" ? "dangnhap.html" : (req.url || "").replace(/^\/+/, "");
    const filePath = path.join(UI_DIR, safeUrl);
    fs.readFile(filePath, (err, data) => {
        if (err) {
            res.writeHead(404);
            res.end("Not Found");
            return;
        }
        res.writeHead(200);
        res.end(data);
    });
});
server.listen(PORT, () => {
    console.log(`http://localhost:${PORT}`);
});
