FROM node
WORKDIR /app
COPY Back .
RUN npm install
EXPOSE 4200
CMD ["npm", "ng serve"]