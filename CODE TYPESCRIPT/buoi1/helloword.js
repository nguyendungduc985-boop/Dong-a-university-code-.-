Package.json
{
  "scripts": {
    "build": "tsc",
    "dev": "ts-node src/index.ts",
    "start": "node dist/index.js"
  }
}
tsconfig.json:
{
  "compilerOptions": {
    "target": "ES2017",
    "module": "commonjs",
    "rootDir": "src",
    "outDir": "dist",
    "strict": true
  },
  "include": ["src"]
}