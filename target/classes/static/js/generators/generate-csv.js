function downloadCsv() {
    const rows = document.querySelectorAll("table tr");
  
    let csvContent = "data:text/csv;charset=utf-8,";
  
    rows.forEach(function (row) {
      const rowData = [];
  
      row.querySelectorAll("th, td").forEach(function (cell) {
        rowData.push(cell.textContent.trim());
      });
  
      csvContent += rowData.join(",") + "\r\n";
    });
  
    const encodedUri = encodeURI(csvContent);
    const link = document.createElement("a");
    link.setAttribute("href", encodedUri);
    link.setAttribute("download", "my-data.csv");
    document.body.appendChild(link); // Required for FF
  
    link.click(); // This will download the CSV file
}