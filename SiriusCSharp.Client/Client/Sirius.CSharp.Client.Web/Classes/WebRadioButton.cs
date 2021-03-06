﻿//-----------------------------------------------------------------------
// <copyright file="WebRadioButton.cs" company="Sirius">
//     Copyright (c) . All rights reserved.
// </copyright>
//-----------------------------------------------------------------------
namespace Sirius.CSharp.Client.Web.Classes
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;

    /// <summary>
    /// TODO: Add documentation.
    /// </summary>
    public class WebRadioButton : WebButton
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WebRadioButton" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="parentElement">TODO: Add documentation for parent element.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebRadioButton(Frame parent, string parentElement, string locator)
            : base(parent, parentElement, locator)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WebRadioButton" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebRadioButton(Frame parent, string locator)
            : base(parent, locator)
        {
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public bool IsChecked()
        {
            return this.Client().IsSelected(this.ParentElement, this.Locator);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        public void Check()
        {
            if (!this.IsChecked())
            {
                this.Click();
            }
        }
    }
}
