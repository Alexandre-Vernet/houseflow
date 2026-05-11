FROM node:20-alpine AS build

WORKDIR /app

COPY houseflow-app/package*.json ./

RUN npm install --production

COPY houseflow-app/ .

RUN npm run build


FROM nginx:alpine

COPY houseflow-app/nginx.conf /etc/nginx/conf.d/default.conf

COPY --from=build app/dist/houseflow-app/browser /usr/share/nginx/html

EXPOSE 80
