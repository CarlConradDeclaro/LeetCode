// function filterBooks() {
//   var searchInput = document.getElementById("search").value.toLowerCase();
//   var allBooks = document.querySelectorAll(".books > section > div");

//   var isBookFound = false;

//   allBooks.forEach(function(bookElement) {
//     var bookAlt = bookElement.querySelector("img").alt.toLowerCase();

//     if (bookAlt.includes(searchInput)) {
//       bookElement.style.display = "inline-block";
//       isBookFound = true;
//     } else {
//       bookElement.style.display = "none";
//     }
//   });

//   var bookSections = document.querySelectorAll(".books > section");

//   bookSections.forEach(function(section) {
//     var visibleBooks = Array.from(section.querySelectorAll("div")).filter(function(bookElement) {
//       return window.getComputedStyle(bookElement).getPropertyValue("display") === "inline-block";
//     });

//     if (visibleBooks.length > 0) {
//       section.style.display = "block";
//     } else {
//       section.style.display = "none";
//     }
//   });

//   var books = document.getElementById("books");
//   if (isBookFound) {
//     books.style.display = "block";
//   } else {
//     books.style.display = "none";
    
//   }
// }

// function searchBooks() {
//   filterBooks();
// }
