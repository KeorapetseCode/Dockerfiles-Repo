FROM node:16.0.0

WORKDIR /app

COPY package.json package-lock.json ./

RUN npm install

ENV PORT=3000

EXPOSE 3000

COPY . .

CMD ["npm", "start"]